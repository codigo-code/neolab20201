import { LitElement, html } from 'lit';

export class NeoView extends LitElement {


    static get properties() {
        return {
            id: { type: Number },
            nombre: { type: String },
            apellido: { type: String },
            edad: { type: Number },
            personas: { type: Array }

        }
    }
    constructor() {
        super();
    }

    render() {
        return html`
            <input type="number" @input="${this.idHandler}" value="${this.id}" placeholder="ingres el id" /><br/>
            <button @click="${this.buscar}">Buscar</button> 

            <br/> 

            <span>${this?.nombre}</span><br/> 
            <span>${this?.apellido}</span><br/> 
            <span>${this?.edad}</span><br/> 

            <br/>
            <div style="border:1px solid">
            ${this.personas?.map(item => html`
            <b>nombre:</b> ${item.nombre} <br/>
            <b>apellido:</b> ${item.apellido} <br/>
            <b>edad:</b> ${item.edad} <br/>
            <hr/>
            `)}
            </div>

            <button @click="${this.getAllPersonas}">Get All Personas </button>

            <br/>

            <button @click="${this.borrar}">Borrar</button>
        `;
    }


    idHandler(e) {
        this.id = e.target.value;
    }

    buscar() {
        fetch('http://localhost:8080/persona/' + this.id).then(data => data.json())
            .then(data => {
                console.log(data);
                this.nombre = data.nombre;
                this.apellido = data.apellido;
                this.edad = data.edad;
            });
    }


    getAllPersonas() {
        fetch('http://localhost:8080/getAllPersona/').then(data => data.json())
            .then(data => {
                console.log(data);
                this.personas = data;
            });
    }

    borrar(){
        if(confirm("desea borrar el id " + this.id + "?")){
            fetch('http://localhost:8080/borrarPersona/' + this.id).then(data => data.json())
            .then(data => {
                console.log(data);
                
            });
        }else{
            alert("el objeto no fue borrado!")
        }
        
    }
}


window.customElements.define('neo-view', NeoView);