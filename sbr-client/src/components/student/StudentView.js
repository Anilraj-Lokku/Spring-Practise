import React, { useEffect, useState } from "react";
import { FaTrashAlt, FaEdit, FaEye } from "react-icons/fa";
import { Link } from "react-router-dom";

import axios from "axios";

const StudentView = () => {
 const [students, setStudents] = useState([]);

 useEffect(() => {
  loadStudents();
 }, []);

 const loadStudents = async () => {
  const result = await axios.get("http://localhost:8080/students", {
   validateStatus: () => {
    return true;
   },
  });
  if (result.status === 302) setStudents(result.data);
 };

 return (
  <section>
   {/* <table>
    <thead>
     <tr>
      <th>ID</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Email</th>
      <th>Department</th>
      <th>Actions</th>
     </tr>
    </thead>

    <tbody>
     {students.map((student, index) => (
      <tr key={student.id}>
       <th scope="row" key={index}>
        {index + 1}
       </th>
       <td>{student.firstName}</td>
       <td>{student.lastName}</td>
       <td>{student.email}</td>
       <td>{student.department}</td>
       <td>View</td>
       <td>Update</td>
       <td>Delete</td>
      </tr>
     ))}
    </tbody>
   </table> */}
   <table class="table table-striped table-bordered table-hover shadow">
    <thead>
     <tr className="text-center">
      <th>ID</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Email</th>
      <th>Department</th>
      <th colSpan="3">Actions</th>
     </tr>
    </thead>
    <tbody className="text-center">
     {students.map((student, index) => (
      <tr key={student.id}>
       <th scope="row">{index + 1}</th>
       <td>{student.firstName}</td>
       <td>{student.lastName}</td>
       <td>{student.email}</td>
       <td>{student.department}</td>
       <td className="mx-2">
        <Link to={`/student-profile/${student.id}`} className="btn btn-info">
         <FaEye />
        </Link>
       </td>

       <td className="mx-2">
        <Link
         to={`/edit-student/${student.id}`}
         className="btn btn-warning btn-sm mr-2"
        >
         <FaEdit />
        </Link>
       </td>

       <td className="mx-2">
        <button className="btn btn-danger btn-sm">
         <FaTrashAlt />
        </button>
       </td>
      </tr>
     ))}
    </tbody>
   </table>
  </section>
 );
};

export default StudentView;
