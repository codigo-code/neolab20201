import logo from './logo.svg';
import './App.css';
import Persona from './components/Persona';
import UsuarioComponent from './components/UsuarioComponent';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        
        <Persona nombre="Simon"></Persona>
        <br/>
        <UsuarioComponent/>
      </header>
    </div>
  );
}

export default App;
