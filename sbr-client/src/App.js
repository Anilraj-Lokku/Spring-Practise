import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
// import "../node_modules/bootstrap/dist/js/bootstrap.min.js";
import "./App.css";
import NavBar from "./components/common/NavBar";
import AddStudent from "./components/student/AddStudent";
import EditStudent from "./components/student/EditStudent";
import StudentView from "./components/student/StudentView";
import StudentPofile from "./components/student/StuentProfile";
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
     <Route exact path="/add-students" element={<AddStudent />}></Route>
     <Route exact path="/edit-student/:id" element={<EditStudent />}></Route>
     <Route
      exact
      path="/student-profile/:id"
      element={<StudentPofile />}
     ></Route>
    </Routes>
   </Router>
  </main>
 );
}

export default App;
