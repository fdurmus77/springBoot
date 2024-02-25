import Header from "./components/Header"
import Login from "./components/Login"
import User from "./components/User"
import logo from './logo.svg';
import './App.css';

const isLoggedIn = false;
const loginLabel = "Giriş Ekranı";
const fullName = "Fatih DURMUŞ"

function App() {
  return (
    <>
      <div className="App">
        <Header />
        {loginLabel} <br></br>
        {
          isLoggedIn ? "Hoşgeldin " + fullName : <Login />
        }
      </div>
      <User name="Fatih" city="Yalova" plate={77}/>
      <User name="Ahmet" city="İstanbul" plate={34}/>
      <User name="Orhan" city="Artvin" plate={8}/>
    </>
  );
}

export default App;
