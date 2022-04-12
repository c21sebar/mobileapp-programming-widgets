
# Rapport

##

Klonat projektet från github
Anävnder LinearLayout och Constraint layout för att visa text, knapp och bild.
En övergripande linearLayout som går vertikalt.
I den layouten finns en till linearLayout som går horizontellt och innehåller 2st textViews som tar upp halva telefonens yta var.
Efter den layouten kommer en constraint layout som innehåller en knapp och en bild
Knappen ligger constraint till view över och bilden ligger constraint till knappen.
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
