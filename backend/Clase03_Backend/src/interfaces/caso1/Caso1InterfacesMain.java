package interfaces.caso1;

interface Animal {
    String PREFIJO = "Emitiendo sonido: ";
    void emitirSonido();
}

class Perro implements Animal {

    @Override
    public void emitirSonido() {
        System.out.println(PREFIJO + "Guau ....");
    }

}

class Leon implements Animal {

    @Override
    public void emitirSonido() {
        System.out.println(PREFIJO + "Grrrr ....");
    }

}

class Caso1InterfacesMain {

    public static void main (String[] args) {

        Perro p = new Perro();
        System.out.println("Sonido del perro: ");
        p.emitirSonido();

        Leon l = new Leon();
        System.out.println("Sonido del león: ");
        l.emitirSonido();
    }
}
