import React, { useEffect, useState } from 'react';

function App() {
  const [msg, setMsg] = useState("");

  useEffect(() => {
    fetch("http://localhost:8080/api/good")
      .then(response => response.text())
      .then(data => setMsg(data));
  }, []);

  return (
    <div>
      <h1>{msg}</h1>
    </div>
  );
}

export default App;

