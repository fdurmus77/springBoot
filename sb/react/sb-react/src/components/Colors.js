// import React from 'react'
// Buton etkileşimi için useState hook u import edilir
import React, { useState } from 'react'

function Color() {
    // Buton etkileşimi için değeri ve setlenmesi
    const [colors, setColors] = useState(["red", "green", "blue"]);

    return (
        <div>
            <button onClick={() => setColors([...colors, Math.random()])}> Colour </button>
            {
                colors.map((color, i) => (<div key={i}> {color}</div>))
            }
        </div>
    )
}

export default Color