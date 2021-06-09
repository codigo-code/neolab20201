import axios from "axios";
import React, { useEffect, useState } from "react";



const RickMorty = (props) =>{


    const [resp, setResp] = useState();
    // el primero metodo que se ejecuta en los hooks
    useEffect( async ()=>{

        // invocamos al API y nos traemos el resultado .... veamos que tiene un await ---> esto se queda esperando a que retorne el callback
        const response = await axios.get('https://rickandmortyapi.com/api/character/'+props?.id);

        setResp(response.data);

    },[props.id]) // si pongo un objeto dentro del vector [obj] y este cambia, vuelve a ejecutar el metodo useEffect
 

    return(
        <React.Fragment>
                <b>nombre:</b> {resp?.name}
                <img src={resp?.image} />

        </React.Fragment>
    );
}

export default RickMorty;