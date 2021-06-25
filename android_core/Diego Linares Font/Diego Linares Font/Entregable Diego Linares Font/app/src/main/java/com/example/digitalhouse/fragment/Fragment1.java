package com.example.digitalhouse.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class Fragment1 extends Fragment {
    private OnFragmentInteractionListener mListener;
    private List<Producto> listaDeProductos;
    private AdapterOP adapterOp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment1, container, false);
        listaDeProductos = new ArrayList<>();

        listaDeProductos.add(new Producto("Play Station 4",4000,R.drawable.ps4,"La nueva ps4 con un aspecto rediseñado más estilizado" +
                "Disfruta de colores increíblemente vivos y brillantes con los asombrosos gráficos HDR." +
                "Un 30 % más delgada y un 16 % más ligera que el modelo de ps4 original." +
                "Guarda tus juegos, aplicaciones, capturas de pantalla y vídeos en el disco duro, disponible con 500 GB o 1 TB de capacidad." +
                "Lo mejor de la televisión, el cine y mucho más desde tus aplicaciones de entretenimiento preferidas."));
        listaDeProductos.add(new Producto("Aire acondicionado Surrey",6000,R.drawable.aireacondicionado,"PHS32C16N\n" +
                "3,2 kw Frío solo\n" +
                "Refrigerante Ecológico R410a\n" +
                "Eficiencia Energética Clase A\n" +
                "Control Remoto Multifunción\n" +
                "Barrido de Aire Automático\n" +
                "Super Silencioso\n" +
                "Función Sleep\n" +
                "Timer Programable\n" +
                "Filtros Lavables\n" +
                "Display LCD"));
        listaDeProductos.add(new Producto("Combo PC Gamer",7000,R.drawable.combopcgamer,"Gabinete Cirkuit Planet GC9B GamingCant: 1Garantía: 24 meses+ infoAM3+ - Asus M5A97LE R2.0Cant: 1Garantía: 24 meses+ infoFx Series X8 8350 4.2 - AM3+Cant: 1Garantía: 36 meses+ infoDdr3 - 8 Gb 1600 Corsair ValueCant: 1Garantía: 99 meses+ infoHD 1.0 Tb Sata3 - WD Black 64mb Cant: 1Garantía: 180 meses+ infoRadeon Rx 480 8Gb Ddr5 Black - XfxCant: 1Garantía: 12 meses+ infoUps Emerson Liebert 650va PSA 650MT3Cant: 1Garantía: 24 meses+ infoFuente GameMax 650W 80 Plus BronceCant: 1Garantía: 36 meses+ info"));
        listaDeProductos.add(new Producto("Drone Gestionador",1000,R.drawable.drone,"El DJI Agras MG-1 es un Octocopter diseñado para la aplicación de precisión tasa variable de pesticidas líquidos, fertilizantes y herbicidas, trayendo nuevos niveles de eficiencia y capacidad de gestión para el sector agrícola."));
        listaDeProductos.add(new Producto("Iphone 7 Red 16gb", 20000,R.drawable.iphone7,"El iPhone 7 tiene un sistema de cámara totalmente nuevo, una pantalla más brillante y con más colores, el mejor rendimiento y la mayor duración de batería en un iPhone, una carcasa resistente a las salpicaduras y al agua , y parlantes estéreo. Es tan poderoso como se ve."));
        listaDeProductos.add(new Producto("MacBook",30000,R.drawable.macbook,"Inicio\n" +
                "Macbook\n" +
                "Apple Macbook Pro 15'' 256GB Touch Bar\n" +
                " Previo | Próximo \n" +
                "Apple Macbook Pro 15'' 256GB Touch Bar\n" +
                "\n" +
                "Todos nuestros productos son originales Apple, los mismos vienen en caja sellada de fabrica incluyendo todos los accesorios originales (cargador 110/220 Volt y cable USB-C).\n" +
                "Disponible con teclado en español\n" +
                "Cuentan con garantía de Apple real por 12 meses."));
        listaDeProductos.add(new Producto("Nintendo3Ds",2500,R.drawable.ninendo3ds,"La inmersión total de nintendo con las pantallas grandes dobles y los gráficos 3D con la versión negra 2015 del sistema de juego de mano 3DS XL de Nintendo.\n" +
                "La Nintendo 3DS es compatible con todos los juegos 3DS y eShop, así como con la mayoría de los juegos DS y DSi. Además, algunas versiones futuras solo estarán disponibles en este modelo de Nintendo 3DS XL 2015. Diseñada para la familia, la Nintendo 3DS XL tiene un control deslizante de profundidad 3D, una cámara 3D, capacidades 3D de seguimiento de cara, StreetPass, SpotPass, conectividad inalámbrica e incluso acceso a la comunidad en línea de Miiverse.\n" +
                "Nota: El adaptador de CA no está incluido. Puede utilizar cualquier cargador de Nintendo 3DS, 2DS, 3DS XL o DSi con la nueva Nintendo 3DS XL.\n" +
                "Rastreo de la cara 3D\n" +
                "La función de rastreo de rostro utiliza las cámaras internas del sistema para ajustar las imágenes en función de su ángulo de visión, para que pueda disfrutar de la inmersión total en sus juegos.\n" +
                "Controles mejorados\n" +
                "El stick C añade posibilidades de control adicionales (como el control intuitivo de la cámara) a los juegos compatibles. Y los botones ZL y ZR añadidos le dan más opciones que antes.\n" +
                "Soporte integrado de amiibo\n" +
                "Toque una figura amiibo para el lector de comunicación de campo cercano (NFC) en la pantalla inferior para disfrutar de las funciones de amiibo en juegos compatibles. Obtén elementos y contenido extra, personaliza tu personaje y más cuando usas figuras de amiibo (como Mario) con juegos compatibles con amiibo.\n" +
                "Más poder\n" +
                "El rendimiento de la CPU mejorado significa tiempos de carga más rápidos, por lo que pasa más tiempo jugando. Muchos juegos se verán y jugarán mejor y varios juegos futuros serán construidos desde cero para aprovechar este aumento de potencia." +
                "Juega más juegos"));
        listaDeProductos.add(new Producto("Nintendo Switch",6543,R.drawable.nintendoswitch,"El Nintendo Switch de 32 GB del sistema de juego va donde usted va. Tome la consola gris de mano en la carretera, o conecte el sistema portátil de Nintendo a su televisor para jugar en casa tradicional. Esta consola híbrida de Nintendo cuenta con un sistema mini controlador conocido como Joy Controllers. Con esta versión, obtendrá los controladores desmontables en colores divertidos y brillantes. Hay un regulador rojo de neón de la alegría y un regulador azul de neón de la alegría en este sistema. El componente principal del sistema Nintendo Switch es la tableta de mano de 6,2 pulgadas con pantalla LCD. El paquete incluye la consola híbrida Nintendo Switch y el muelle Switch. También viene con dos Joy-Contras. El derecho es el controlador de neón rojo Joy. El izquierdo es el Joy Control de neón azul."));
        listaDeProductos.add(new Producto("Peliculas Pokemon",10,R.drawable.peliculaspokemon,"Una saga imperdible llena de aventuras y buenos mensajes a poco precio!"));
        listaDeProductos.add(new Producto("Samsung galaxy S7 Edge",8200,R.drawable.s7edge,"Resistente agua y polvo" +
                "\n" +
                "Con Galaxy S7 edge ya no tendrás que preocuparte si dejas el teléfono sobre una superficie mojada" +
                "Puedes seguir utilizándolo aunque se haya caído al agua. Puedes jugar en la piscina, publicar selfies en la playa y llamar un taxi bajo la lluvia" +
                "Tienen el IP (Grado de protección) con código 68. Se pueden sumergir a 1.5 metros bajo el agua durante un máximo de 30 minutos" +
                "Dual Pixel 12MP" +
                "" +
                "Todos los pixeles en el sensor de la imagen tienen 2 fotodiodos en lugar de uno, esto significa que te permite hacer foco de modo rápido y preciso como lo harías vos con tus propios ojos"));
        listaDeProductos.add(new Producto("Samsung j7",2313,R.drawable.samsungj7,"Pura elegancia" +
                "" +
                "Elegancia y robustez a partes iguales. Su marco metálico protegerá tu smartphone para que puedas admirar la belleza de tu Galaxy J7 por más tiempo." +
                "Disfruta de fotos lo más nítidas posible incluso en escenas oscuras, y todo gracias al rápido objetivo F1.9 de su cámara delantera y trasera. Y para que no te pierdas ningún momento, accede a la cámara haciendo doble clic en el botón de inicio." +
                "Disfruta de tu smartphone y sus aplicaciones de forma totalmente fluida por más tiempo gracias a su batería de gran duración y el modo ultrahorro de energía." +
                "Muestra siempre tu mejor cara" +
                "" +
                "Con Galaxy J7 no tendrás perfil malo. Gracias a su LED frontal y el modo belleza, siempre saldrás perfecto. Además, con el reconocimiento de saludo podrás hacer el selfie perfecto en cuestión de segundos."));




        ListView listView = (ListView) view.findViewById(R.id.list_view);
        adapterOp = new AdapterOP(getContext(), listaDeProductos);

        listView.setAdapter(adapterOp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Producto producto = (Producto)parent.getItemAtPosition(position);
                mListener.onFragmentInteraction(producto.getNombre(),producto.getDescripcion(),producto.getImagen(),producto.getPrecio());

            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String nombre, String descripcion, Integer imagen,Integer precio );
    }
}

