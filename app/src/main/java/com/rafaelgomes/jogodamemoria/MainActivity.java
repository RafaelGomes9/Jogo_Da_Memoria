package com.rafaelgomes.jogodamemoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {





    ImageButton botao1;
    ImageButton botao2;
    ImageButton botao3;
    ImageButton botao4;
    ImageButton botao5;
    ImageButton botao6;
    ImageButton botao7;
    ImageButton botao8;
    ImageButton botao9;
    ImageButton botao10;
    ImageButton botao11;
    ImageButton botao12;

    TextView textPares;
    TextView textNumeroPartidas;

    int jogadas;
    int paresFormados;
    int numeroPartidas;



    int[] jellys;

    ArrayList<Integer> embaralharJellys;

    ArrayList<Integer> compararImagens;

    ArrayList<ImageButton> botoesEscolhidos;

    ArrayList<ImageButton> botoes;

    Button jogarNovamente;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        botao1= findViewById(R.id.botao1);
        botao2= findViewById(R.id.botao2);
        botao3= findViewById(R.id.botao3);
        botao4= findViewById(R.id.botao4);
        botao5= findViewById(R.id.botao5);
        botao6= findViewById(R.id.botao6);
        botao7= findViewById(R.id.botao7);
        botao8= findViewById(R.id.botao8);
        botao9= findViewById(R.id.botao9);
        botao10= findViewById(R.id.botao10);
        botao11= findViewById(R.id.botao11);
        botao12= findViewById(R.id.botao12);

        jogarNovamente= findViewById(R.id.buttonJogarNovamente);






        botao1.setOnClickListener(this);
        botao2.setOnClickListener(this);
        botao3.setOnClickListener(this);
        botao4.setOnClickListener(this);
        botao5.setOnClickListener(this);
        botao6.setOnClickListener(this);
        botao7.setOnClickListener(this);
        botao8.setOnClickListener(this);
        botao9.setOnClickListener(this);
        botao10.setOnClickListener(this);
        botao11.setOnClickListener(this);
        botao12.setOnClickListener(this);

        jogarNovamente.setOnClickListener(this);
        jogarNovamente.setVisibility(View.GONE);

        textPares= findViewById(R.id.textParesFormados);
        textNumeroPartidas= findViewById(R.id.textNumeroPartidas);




        prepararJogo();


    }

    @Override
    public void onClick(View v) {


        int id= v.getId();


        switch (id)

        {

            case R.id.botao1:
                botao1.setImageResource(embaralharJellys.get(0));
                jogadas++;
                compararImagens.add(embaralharJellys.get(0));
                botao1.setClickable(false);
                botoesEscolhidos.add(botao1);
                break;


            case R.id.botao2:
                botao2.setImageResource(embaralharJellys.get(1));
                jogadas++;
                compararImagens.add(embaralharJellys.get(1));
                botao2.setClickable(false);
                botoesEscolhidos.add(botao2);
                break;

            case R.id.botao3:
                botao3.setImageResource(embaralharJellys.get(2));
                jogadas++;
                compararImagens.add(embaralharJellys.get(2));
                botao3.setClickable(false);
                botoesEscolhidos.add(botao3);
                break;

            case R.id.botao4:
                botao4.setImageResource(embaralharJellys.get(3));
                jogadas++;
                compararImagens.add(embaralharJellys.get(3));
                botao4.setClickable(false);
                botoesEscolhidos.add(botao4);
                break;

            case R.id.botao5:
                botao5.setImageResource(embaralharJellys.get(4));
                jogadas++;
                compararImagens.add(embaralharJellys.get(4));
                botao5.setClickable(false);
                botoesEscolhidos.add(botao5);
                break;


            case R.id.botao6:
                botao6.setImageResource(embaralharJellys.get(5));
                jogadas++;
                compararImagens.add(embaralharJellys.get(5));
                botao6.setClickable(false);
                botoesEscolhidos.add(botao6);
                break;

            case R.id.botao7:
                botao7.setImageResource(embaralharJellys.get(6));
                jogadas++;
                compararImagens.add(embaralharJellys.get(6));
                botao7.setClickable(false);
                botoesEscolhidos.add(botao7);
                break;


            case R.id.botao8:
                botao8.setImageResource(embaralharJellys.get(7));
                jogadas++;
                compararImagens.add(embaralharJellys.get(7));
                botao8.setClickable(false);
                botoesEscolhidos.add(botao8);
                break;

            case R.id.botao9:
                botao9.setImageResource(embaralharJellys.get(8));
                jogadas++;
                compararImagens.add(embaralharJellys.get(8));
                botao9.setClickable(false);
                botoesEscolhidos.add(botao9);
                break;

            case R.id.botao10:
                botao10.setImageResource(embaralharJellys.get(9));
                jogadas++;
                compararImagens.add(embaralharJellys.get(9));
                botao10.setClickable(false);
                botoesEscolhidos.add(botao10);
                break;

            case R.id.botao11:
                botao11.setImageResource(embaralharJellys.get(10));
                jogadas++;
                compararImagens.add(embaralharJellys.get(10));
                botao11.setClickable(false);
                botoesEscolhidos.add(botao11);
                break;

            case R.id.botao12:
                botao12.setImageResource(embaralharJellys.get(11));
                jogadas++;
                compararImagens.add(embaralharJellys.get(11));
                botao12.setClickable(false);
                botoesEscolhidos.add(botao12);
                break;

            case R.id.buttonJogarNovamente:
                novoJogo();
                break;









        }


        verificarPares();
        fimDeJogo();




    }


    public void prepararJogo()
    {


        jellys= new int[] {R.drawable.jelly_1,R.drawable.jelly_2,R.drawable.jelly_3,R.drawable.jelly_4,R.drawable.jelly_5,R.drawable.jelly_6};
        embaralharJellys= new ArrayList<>();
        compararImagens= new ArrayList<>();
        botoesEscolhidos= new ArrayList<>();

        botoes= new ArrayList<>();



        botoes.add(botao1);
        botoes.add(botao2);
        botoes.add(botao3);
        botoes.add(botao4);
        botoes.add(botao5);
        botoes.add(botao6);
        botoes.add(botao7);
        botoes.add(botao8);
        botoes.add(botao9);
        botoes.add(botao10);
        botoes.add(botao11);
        botoes.add(botao12);

        for(ImageButton botao:botoes)
        {

            botao.setTag("Não encontrado");




        }








        for(int i=0;i<jellys.length;i++)

        {



            embaralharJellys.add(jellys[i]);
            embaralharJellys.add(jellys[i]);







        }

        Collections.shuffle(embaralharJellys);








    }


    public void verificarPares()
    {

        if(jogadas==2)
        {

            if(compararImagens.get(0).equals(compararImagens.get(1)))
            {




                parCorreto();


            }



            else
            {




                comecarDeNovo();



            }






        }









    }


    public void parCorreto()
    {



        paresFormados++;
        textPares.setText("Pares Formados: "+paresFormados);
        jogadas=0;
        compararImagens.clear();
        botoesEscolhidos.get(0).setTag("Par encontrado");
        botoesEscolhidos.get(1).setTag("Par encontrado");
        botoesEscolhidos.clear();






    }




    public void comecarDeNovo()
    {

        for(ImageButton botao: botoes)
        {

            if(botao.getTag().equals("Não encontrado"))
            {

                botao.setClickable(false);




            }






        }




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                jogadas = 0;
                compararImagens.clear();
                botoesEscolhidos.get(0).setImageResource(R.drawable.help);
                botoesEscolhidos.get(1).setImageResource(R.drawable.help);
                botoesEscolhidos.clear();


                for (ImageButton botao : botoes) {

                    if (botao.getTag().equals("Não encontrado")) {

                        botao.setClickable(true);


                    }


                }


            }
        },1000*2);

    }




    public void fimDeJogo()
    {



        if(paresFormados==6)
        {

            numeroPartidas++;
            textNumeroPartidas.setText("Número de partidas: "+numeroPartidas);
            jogarNovamente.setVisibility(View.VISIBLE);
            paresFormados=0;










        }





    }


    public void novoJogo()
    {

        Collections.shuffle(embaralharJellys);
        textPares.setText("Pares Formados: 0");


        for (ImageButton botao:botoes)
        {

            botao.setTag("Não encontrado");
            botao.setClickable(true);
            botao.setImageResource(R.drawable.help);







        }

        jogarNovamente.setVisibility(View.GONE);






    }





}