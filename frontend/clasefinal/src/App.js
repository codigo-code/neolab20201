import logo from './logo.svg';
import './App.css';
import Auto from './components/Auto';
import Persona from './components/Persona';
import { useReducer, useState } from 'react';

function App() {

  const [vista, setVista] = useState();
  const reducer = (state, action) => {


    switch (action.type) {
      case 'auto':


        setVista(<Auto />);
        break;

      case 'persona':
        setVista(<Persona />);
        break;
    }
  }
const [state, dispacher] = useReducer(reducer,vista);
  return (
    <div className="App">
      <button onClick={() => {
        dispacher({
          type: 'persona'
        })

      }}>Persona</button><br />

      <button onClick={() => {
        dispacher({
          type: 'auto'
        })

      }}>Auto</button><br />

      {vista}
    </div>
  );
}

export default App;
