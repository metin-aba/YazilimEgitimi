const initialState = {
  notes: [],
  filter: '',
};

function rootReducer(state = initialState, action) {
  switch (action.type) {
    case 'ADD_NOTE':
      return {
        ...state,
        notes: [...state.notes, action.payload],
      };
    case 'SET_FILTER':
      return {
        ...state,
        filter: action.payload,
      };
    default:
      return state;
  }
}

export default rootReducer;
