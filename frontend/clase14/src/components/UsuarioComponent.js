import React from 'react';


class UsuarioComponent extends React.Component{

    constructor(){
        super();
        console.log('constructor');
    }

    componentDidMount(){
        console.log('componente montado');
    }


    render(){
        return(
            <div>
                    <h2>Hola desde un componente!</h2>
            </div>
        );
    }
}


export default UsuarioComponent;