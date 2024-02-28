import Header from "./components/Header"
import Login from "./components/Login"
import User from "./components/User"
import Counter from "./components/Counter"
import Colors from "./components/Colors"
import './App.css';

const isLoggedIn = false;
const loginLabel = "Giriş Ekranı";
const fullName = "Fatih DURMUŞ";

function App() {
  return (
    <>
      <div className="App">
        <Header />
        {loginLabel} <br></br>
        {
          isLoggedIn ? "Hoşgeldin " + fullName : <Login />
        }
      <Counter/>
      <Colors/>
    </div >
      <User name="Fatih" city="Yalova" plate={77}  />
      <User name="Ahmet" city="İstanbul" plate={34} friends={['Orhan', 'Gül', 'Sultan']} />
      <User name="Orhan" city="Artvin" plate={8} friends={['Hatice', 'Ayşe', 'Saniye']} />
    </>
  );
}

export default App;
