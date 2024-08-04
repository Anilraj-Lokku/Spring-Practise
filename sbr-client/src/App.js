import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
// import "../node_modules/bootstrap/dist/js/bootstrap.min.js";
import "./App.css";
import NavBar from "./components/common/NavBar";
import StudentView from "./components/student/StudentView";
import Home from "./Home";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

function App() {
 return (
  <main className="container mt-5">
   {/* <StudentView /> */}
   <Router>
    <NavBar />
    <Routes>
     <Route exact path="/" element={<Home />}></Route>
     <Route exact path="/view-students" element={<StudentView />}></Route>
    </Routes>
   </Router>
  </main>
 );
}

export default App;
