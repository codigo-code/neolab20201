
import { LitElement, html } from 'lit';




export class NeoForm extends LitElement {

    static get properties() {

        return {
            nombre: { type: String },
            apellido: { type: String },
            edad: { type: Number }

        }
    }

    constructor() {
        super();
    }

    render() {

        return html`
            <input type="text" value="${this.nombre}" @input="${this.handlerNombre}" placeholder="ingrese el nombre" /> <br/>
            <input type="text" value="${this.apellido}" @input="${this.handlerApellido}" placeholder="ingrese el apellido" /> <br/>
            <input type="text" value="${this.edad}" @input="${this.handlerEdad}" placeholder="ingrese la edad" /> <br/>
            <button @click="${this.enviar}">guardar </button>
            `;
    }

    handlerNombre(e) {
        this.nombre = e.target.value;
    }
    handlerApellido(e) {
        this.apellido = e.target.value;
    }
    handlerEdad(e) {
        this.edad = e.target.value;
    }


    enviar() {
        var obj = {
            nombre: this.nombre,
            apellido: this.apellido,
            edad: this.edad
        }


        fetch('http://localhost:8080/savePersona', { method: 'POST', body: JSON.stringify(obj), headers: { 'Content-Type': 'application/json' } })

    }
}


window.customElements.define('neo-form', NeoForm);