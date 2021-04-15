
# Assignment 4

### EditText
I activity_main.xml har elementet EditText lagts till. Elementet har ett antal rader kod som styr storlek och placering på skärmen. Bredden på elementet är satt till match_parent vilket betyder att det ska vara lika brett som förälderelementet. Höjden däremot har istället wrap_content vilket betyder att höjden kommer att anpassas efter innehållet i elementet. EditText har fyra rader kod som styr elementets placering. Alla fyra kodraderna är satt till "parent" vilket betyder att elementet kommer att placeras i centrerat av skärmen. För att elementet ska ha en förskriven text i rutan används andorid:hint tillsammans med "skriv din text här!". Det är alltså den mening som kommer att fylla elementets ruta tills det att en användare redigerar innehållet. Sist har också ett ID placerats på elementet vilket är my_edittext och kommer att användas i senare kodstycken.

```
<EditText
android:id="@+id/my_edittext"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Skriv din text här!"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintLeft_toLeftOf="parent"
app:layout_constraintRight_toRightOf="parent"
app:layout_constraintTop_toTopOf="parent" />
```

### Styling på EditText
För att styla elementet EditText har ett antal rader kod applicerats i xml-filen. Med hjälp av olika margin:s har elementet förflyttas från ursprungspunkten till en position som passar elementet bättre. Dessutom har en bakgrunsfärg och textfärg applicerats för att tydliggöra elementet från applikationens bakgrund. Det finns även kod som styr storleken på texten samt vilken marginal texten ska ha till elementets kanter.
```
 <EditText
        android:id="@+id/my_edittext"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/skriv_din_text_h_r"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:layout_marginTop="170dp"
        android:layout_marginLeft="15dp"
        android:layout_marginRight="15dp"
        android:padding="5dp"
        android:background="#71bec9"
        android:textColorHint="#fff"
        android:textColor="#fff"
        android:textSize="18sp" />
```


### ImageView
I activity_main.xml har elementet ImageView lagts till. Elementet har först och främst fyra rader kod som placerar ImageView centrerat på skrämen genom att ange "parent" för layout_constraint följt av riktningen. Elementets bredd och höjd är satt till match_parent vilket betyder att bilden kommer att anpassas efter förälderns bredd och höjd. För att elementet ska veta vilken bild som ska visas används app:srcCompat tillsammans med namnet på bilden. Bilden är också placerat i appen drawable. Sist finns också marginBottom tillsammans med 320dp som placerar bilden korrekt i appliaktionen utan att täcka andra element.
```
<ImageView
        android:id="@+id/imageView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:srcCompat="@drawable/vinter"
        android:contentDescription="@string/winter_landscape"
        tools:layout_editor_absoluteX="123dp"
        tools:layout_editor_absoluteY="315dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:layout_marginBottom="320dp" />
```

### Layoutfil kommande ListView
För att kunna skapa ett kommande ListView element har en ny layoutfil skapapts i mappen Layout. Filen döps till list_view_file.xml och innehåller ett TextView element. Till elementet skapats ett ID med hjälp av android:id. Det ID som anges är densamma namn som filnamnet på layoutfilen.
```
<?xml version="1.0" encoding="utf-8"?>
<TextView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/list_view_file.xml">
</TextView>
```

### Arraylista
I Public class i MainActitiy.java skapas en arraylista som kommer innehålla namn på städer. För att skapa en arraylista anges först en private string följt av namnet på arrayen vilket i detta fall är Städer. Därefter appliceras innehållet i arrayen innanför måsvingarna. I detta fall består arrayen av tre städer. När en private string applicerats måste också en private Arraylist skapas. Arraylistan som skapas är satt till string vilket betyder att listan ska innehålla strängen som precis har skapats. Därefter kommer "ListData=new ArrayList<>(Arrays.asList(Städer))" vilket betyder att arraylistan kommer att innehålla strängen som är definerad till Städer. I detta fall kommer listan bestå av Stockholm, Göteborg och Malmö. I och med att arraylistan skapas importeras också Arrays och ArrayList i MainActivity.java.
```
 private String[] Städer = {"Stockholm", "Göteborg", "Malmö"};
 private ArrayList<String> ListData=new ArrayList<>(Arrays.asList(Städer));
```

### Arrayadapter
I MainActivity.java skapas en arrayadapter som kommer att användas för att presentera innehållet från arrayen i en lista. I koden anges ArrayAdapter följt av String då det är den som kommer att presenteras i listan. För att koden ska veta vilket element som ska användas anges det ID som applicerades på TextView elementet i layoutfilen. Med hjälp av kodraden har en arrayadapter nu skapats.

```
ArrayAdapter<String> adapter=new ArrayAdapter<String>( this,R.layout.list_view_file,R.id.list_view_file_xml,ListData);
```

## Referens till ListView
När en arrayadapter skapats är det dags att ange en referens till ListView. För att ange en referens anges ListView i MainActivity.java följt av my_listeview. För att koden ska veta vilket element som ska anropas anges findViewById följt av ett ID som kommer att anges på det kommande ListView elementet. Det är alltså ett kommande ListView element som anges som referens i MainActivity.java.

```
ListView my_listeview=(ListView) findViewById(R.id.listview_item);
```
I och med att ett ListView element skapats har också elementet automatiskt importerats i MainActivity.java.
```
import android.widget.ListView;
```
### Ansluta arrayadapter till ListView
Sist måste också arrayadapterna ansluta till ListView för att kunna presentera innehållet i arrayen i en lista. För att ansluta adapter anges namnet på ListView elementet tillsammans med koden setAdapter(adapter) och på så sätt har elementen anslutit till varandra.

```
my_listeview.setAdapter(adapter);
```

### Item click listner
För att användaren ska kunna interagera med listan som visas i applikationen skapas en item click listner i MainActivity.java. För att skapa en item click listner anges my_listeview tillsammans med setOnItemClickListener. Dessutom skapas en public void som styr vad som kommer att hända när användaren klickar på en av raderna i listan som presenteras. Innuti funktionen skapas en toast som innehåller en sträng text. Texten som adderas i koden är den text som kommer att presenteras för användaren när en interaktion sker med ListView elementet. När användaren klickar på ett element i listan kommer en toast presenteras i appen som skriver ut texten "Fin stad!".

```
my_listeview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
Toast.makeText(getApplicationContext(), "Fin stad!", Toast.LENGTH_LONG).show();

}
});
```

### ListView element
I activity_main.xml skapas nu ett ListView element. Elementet får en bredd och höjd som ska vara lika stor som elementets förälder eftersom match_parent anges i koden. Dessutom anges ett ID på ListView elementet. Det ID som anges är det ID som angavs i MainActivity.java när en referens skapades till ListView. Anledningen till att de ska ha samma ID är för att rätt referens ska anges och för att rätt innehåll ska presenteras på rätt ställe.

```
<ListView
android:layout_width="match_parent"
android:layout_height="match_parent"
android:id="@+id/listview_item">

</ListView>
```



