
# Rapport

##

Klonat projektet från github
Anävnder LinearLayout och Constraint layout för att visa text, knapp och bild.
En övergripande linearLayout som går vertikalt.
```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/LinearLayoutRootID"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity"
    android:background="@color/colorAccent"
   >
```
I den layouten finns en till linearLayout som går horizontellt.
```xml
    <LinearLayout
        android:layout_marginTop="25dp"
        android:id="@+id/LinearLayoutHorizontalID"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        >
```
Denna layout innehåller 2st textViews som tar upp halva telefonens yta i bredd var med hjälp layout weight.
```xml
        <TextView
            android:id="@+id/textView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="TextView1"
            android:textColor="@color/black"
            android:textSize="24sp"/>
```
Efter den layouten kommer en constraint layout som ligger i den vertikala liner layout som innehåller en knapp och en bild.
```xml
 <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/ConstraintLayoutID"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

```
Knappen ligger constraint till view över och bilden ligger constraint till knappen.
```xml
        <Button
            android:id="@+id/ButtonID"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@color/white"
            android:text="Click ME"
            android:textColor="@color/black"
            android:textSize="48sp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <ImageView
            android:background="@color/black"
            android:id="@+id/ImageViewID"
            android:layout_width="150dp"
            android:layout_height="150dp"
            android:visibility="invisible"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/ButtonID"
            app:srcCompat="@drawable/logofull" />
```
Knappen gör bilden synlig/icke-synlig.
```Java
 super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.ButtonID);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("KLICK", "onClick: HALLO");
                if (findViewById(R.id.ImageViewID).getVisibility()== View.VISIBLE){
                    Log.d("KLICK", "onClick: INVISIBLE");
                     findViewById(R.id.ImageViewID).setVisibility(View.INVISIBLE);
                }
                else if (findViewById(R.id.ImageViewID).getVisibility()== View.INVISIBLE){
                    Log.d("KLICK", "onClick: VISIBLE");
                    findViewById(R.id.ImageViewID).setVisibility(View.VISIBLE);

                }
            }
        });

```



![](Screenshot1.png)
![](Screenshot2.png)
