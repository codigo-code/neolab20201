import React, { useState } from 'react';
import RickMorty from './RickMorty';


// creo un hooks basado en ES5

const Persona = (props)=>{

  const [num, setNum] = useState(1);
   const [id, setId] = useState(3)
  // const [nombre, setNombre]= useState("dante");

    return(
        <div>
            <h2>Hola {props.nombre}</h2>
            <br/>
            <h3>Soy del Lab de Neo!</h3>

            <input type="number" placeholder="ingrese el id"  value={id}  onChange={(e)=>{
               // console.log(e.target.value);
                    setId(e.target.value)
                    console.log(id);
                    
            }} />

            <button onClick={()=>{
                console.log('hola desde el press!' + num)
                var res = num+1
                setId(res)

            }}>Press me!</button><br/>
<RickMorty id={id} />
        
        </div>

    );
}


export default Persona;