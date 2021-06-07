package com.yamilecen.yamilecenparcial1aplicacionesmoviles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import com.yamilecen.yamilecenparcial1aplicacionesmoviles.adapter.RecyclerAdapter;
import com.yamilecen.yamilecenparcial1aplicacionesmoviles.model.ItemList;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvLista;
    private RecyclerAdapter adapter;
    private List<ItemList> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initValues();
    }
    private void initViews(){
        rvLista =findViewById(R.id.rvLista);
    }

    private void  initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);
        items = getItems();
        adapter = new RecyclerAdapter(items,  this::itemClick);
        rvLista.setAdapter(adapter);

    }
    private List<ItemList> getItems()
    {
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList("JÚPITER","Es el planeta más grande del sistema solar y el quinto en orden de lejanía al Sol. Es un gigante gaseoso que forma parte de los denominados planetas exteriores. Recibe su nombre del dios romano Júpiter (Zeus en la mitología griega). Es el tercer objeto natural más brillante en un cielo nocturno despejado después de la Luna y Venus.Se trata del planeta que ofrece un mayor brillo a lo largo del año dependiendo de su fase. ",R.drawable.jupiter,R.drawable.jupitertabla));
        itemLists.add(new ItemList("URANO","Es el séptimo planeta del sistema solar, el tercero de mayor tamaño, y el cuarto más masivo. Se llama así en honor de la divinidad griega del cielo Urano (del griego antiguo Οὐρανός), el padre de Crono (Saturno) y el abuelo de Zeus (Júpiter). Aunque es detectable a simple vista en el cielo nocturno, no fue catalogado como planeta por los astrónomos de la antigüedad debido a su escasa luminosidad y a la lentitud de su órbita.",R.drawable.urano,R.drawable.uranotabla));
        itemLists.add(new ItemList("NEPTUNO","Es el octavo planeta en distancia respecto al Sol y el más lejano del sistema solar. Forma parte de los denominados planetas exteriores, y dentro de estos, es uno de los gigantes helados, y es el primero que fue descubierto gracias a predicciones matemáticas. Su nombre fue puesto en honor al dios romano del mar Neptuno, y es el cuarto planeta en diámetro y el tercero más grande en masa. Su masa es diecisiete veces la de la Tierra y ligeramente mayor que la de su planeta gemelo Urano.",R.drawable.neptuno,R.drawable.neptunotabla));
        itemLists.add(new ItemList("TIERRA","Es un planeta del sistema solar que gira alrededor del Sol en la tercera órbita más interna. Es el más denso y el quinto mayor de los ocho planetas del sistema solar. También es el mayor de los cuatro terrestres o rocosos. La Tierra se formó hace aproximadamente 4550 millones de años y la vida surgió unos mil millones de años después. ",R.drawable.tierra,R.drawable.tierratabla));
        itemLists.add(new ItemList("VENUS","Es el segundo planeta del sistema solar en orden de proximidad al Sol y el tercero en cuanto a tamaño en orden ascendente después de Mercurio y Marte. Al igual que este último, carece de satélites naturales. Recibe su nombre en honor a Venus, la diosa romana del amor (gr. Afrodita). Al ser el segundo objeto natural más brillante después de la Luna, puede ser visto en un cielo nocturno despejado a simple vista.",R.drawable.venus,R.drawable.venustabla));
        itemLists.add(new ItemList("MERCURIO","Es el planeta del sistema solar más próximo al Sol y el más pequeño. Forma parte de los denominados planetas interiores o terrestres y carece de satélites naturales al igual que Venus. Se conocía muy poco sobre su superficie hasta que fue enviada la sonda planetaria Mariner 10 y se hicieron observaciones con radar y radiotelescopios. Posteriormente fue estudiado por la sonda MESSENGER de la NASA y actualmente la astronave de la Agencia Europea del Espacio (ESA) denominada BepiColombo.",R.drawable.mercurio,R.drawable.mercuriotabla));
        itemLists.add(new ItemList("SATURNO","Es el sexto planeta del sistema solar contando desde el Sol, el segundo en tamaño y masa después de Júpiter y el único con un sistema de anillos visible desde la Tierra. Su nombre proviene del dios romano Saturno. Forma parte de los denominados planetas exteriores o gaseosos. El aspecto más característico de Saturno son sus brillantes anillos. Antes de la invención del telescopio, Saturno era el más lejano de los planetas conocidos y, a simple vista, no parecía luminoso ni interesante. ",R.drawable.saturno,R.drawable.saturnotabla));
        itemLists.add(new ItemList("MARTE","Es el cuarto planeta en orden de distancia al Sol y el segundo más pequeño del sistema solar, después de Mercurio.Recibió su nombre en homenaje al dios de la guerra de la mitología romana (Ares en la mitología griega), y también es conocido como «el planeta rojo»debido a la apariencia rojiza que le confiere el óxido de hierro predominante en su superficie. Marte es el planeta interior más alejado del Sol. ",R.drawable.marte,R.drawable.martetabla));

        return itemLists;
    }


    public void itemClick(ItemList item) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("itemDetail", item);
        startActivity(intent);
    }
}