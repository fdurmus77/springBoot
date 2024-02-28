// import React from 'react'
// Buton etkileşimi için useState hook u import edilir
import React, { useState } from 'react'

function Counter() {
    // Buton etkileşimi için değeri ve setlenmesi
    const [count, setCount] = useState(0);

    return (
        <div>
            <button onClick={() => setCount(count + 1)}> Login </button>
            <h1> {count} </h1>
        </div>
    )
}

export default Counter