
import React from 'react'
import { useState } from "react"
import './App.css';
import Header from './components/Header';
import Tasks from './components/Tasks';


function App() {
  const [tasks, setTasks] = useState([

    {
        id:1,
        text: 'Yoga - Surya Namaskar',
        day: '30 March 2023 at 6:00 AM',
        reminder: true
    },
    {
        id:2,
        text: 'Scrum Meeting',
        day: '30 March 2023 at 7:30 AM',
        reminder: true
    },
    {
        id:3,
        text: 'Breakfast',
        day: '30 March 2023 at 8:30 AM',
        reminder: false
    },
    {
        id:4,
        text: 'Training',
        day: '30 March 2023 at 9:00 AM',
        reminder: true
    }

])

  // delete task

  const deleteTask = (id) => {
    // updating the state...which excludes item whose id is passed
      setTasks(tasks.filter((task) => task.id !== id))
  }



  return (
    <div className="container">
      <Header/>
      {tasks.length > 0 ? 
      <Tasks tasks={tasks} onDelete={deleteTask}/>
      : 'No Tasks Available for Today'}
    </div>
  );
}

export default App;
