import React from 'react';
import { connect } from 'react-redux';
import { flipCard, resetGame } from './actions';

class App extends React.Component {
  handleCardClick(index) {
    const { cards, flipCard } = this.props;
    const selectedCard = cards[index];

    // Kart zaten açıksa işlem yapma
    if (selectedCard.flipped) return;

    flipCard(index);
    this.checkMatch();
  }

  checkMatch() {
    const { cards, flippedCards, flipCard } = this.props;
    const flippedCount = flippedCards.length;

    if (flippedCount === 2) {
      const [firstCardIndex, secondCardIndex] = flippedCards;

      if (cards[firstCardIndex].id === cards[secondCardIndex].id) {
        // Eşleşme durumu
        setTimeout(() => {
          this.props.resetFlippedCards();
        }, 500);
      } else {
        // Eşleşmeme durumu
        setTimeout(() => {
          flipCard(firstCardIndex);
          flipCard(secondCardIndex);
          this.props.resetFlippedCards();
        }, 1000);
      }
    }
  }

  render() {
    const { cards, flippedCards } = this.props;

    return (
      <div className="game-container">
        <h1>Hafıza Oyunu</h1>
        <div className="score">Puan: {this.props.score}</div>
        <div className="board">
          {cards.map((card, index) => (
            <div
              className={`card ${card.flipped ? 'flipped' : ''}`}
              key={index}
              onClick={() => this.handleCardClick(index)}
            >
              <div className="card-inner">
                <div className="card-front">?</div>
                <div className="card-back">{card.value}</div>
              </div>
            </div>
          ))}
        </div>
        <button className="reset-button" onClick={this.props.resetGame}>
          Yeniden Oyna
        </button>
      </div>
    );
  }
}

const mapStateToProps = (state) => {
  return {
    cards: state.cards,
    flippedCards: state.flippedCards,
    score: state.score,
  };
};

const mapDispatchToProps = (dispatch) => {
  return {
    flipCard: (index) => dispatch(flipCard(index)),
    resetFlippedCards: () => dispatch({ type: 'RESET_FLIPPED_CARDS' }),
    resetGame: () => dispatch(resetGame()),
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(App);
