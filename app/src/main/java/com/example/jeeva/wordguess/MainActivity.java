package com.example.jeeva.wordguess;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String COUNT_INT = "countInt";
    public static final String SCORE_INT = "ScoreInt";
    public static final String KEY_INT = "keyInt";
    public static final String KEY_ARRAY = "KeyArray";
    public static final String WORD_LIST_MAP = "wordListMap";

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(COUNT_INT,count);
        savedInstanceState.putInt(SCORE_INT,Score);
        savedInstanceState.putString(KEY_INT, key);
        savedInstanceState.putSerializable(KEY_ARRAY,keyArray);
        savedInstanceState.putSerializable(WORD_LIST_MAP,wordList);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count=savedInstanceState.getInt(COUNT_INT);
        Score=savedInstanceState.getInt(SCORE_INT);
        key=savedInstanceState.getString(KEY_INT);
        keyArray= (Object[]) savedInstanceState.getSerializable(KEY_ARRAY);
        wordList= (HashMap<String, ArrayList<String>>) savedInstanceState.getSerializable(WORD_LIST_MAP);
        int length = key.length();
        hint.setText(String.format("HINT : number of character : %d", length));
        hint = (TextView) findViewById(R.id.hint_textView);
        ArrayList<String> values = wordList.get(key);
        ArrayAdapter<String> optionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);
        optionList.setAdapter(optionAdapter);
        TextView scoreTextView = (TextView) findViewById(R.id.scoreTextView);
        scoreTextView.setText("Score:"+Score);
    }

    public HashMap<String,ArrayList<String>> wordList = new HashMap<>();
    String[] a ={"student","teachers","library"};
    String[] b ={"doctors","nurse","medicines"};
    String[] c ={"fuel","brown","vehicles"};
    String[] d ={"study","learn","answer"};
    String[] e = {"plant","green","desert"};
    String[] f = {"reptile","Hiss","long"};
    String[] g = {"water","sea","transport"};
    String[] h = {"honey","insect","hive"};
    String[] i = {"food","egg","kfc"};
    String[] k = {"milk","animal","farm"};
    String[] l = {"green","garden","field"};
    String[] m = {"book","writer","story"};
    String[] n = {"dressUp","hair","court"};
    String[] o = {"driver","ride","transport"};
    String[] p = {"feeling","eat","food"};
    String[] q = {"yellow","cow","pizza"};
    String[] r = {"photos","lens","travel"};
    String[] s ={"Bird","arctic","black&white"};
    String[] t = {"cold","summer","cone"};
    String[] u ={"winter","shoe","warm"};
    String[] v ={"tree","plant","green"};
    String[] w ={"car","public","transport"};
    String[] x = {"fly","plane","profession"};
    String[] y = {"cross","river","build"};
    String[] z = {"hump","desert","animal"};

    ArrayList<String> ele1 = new ArrayList<>(Arrays.asList(a));
    ArrayList<String> ele2 = new ArrayList<>(Arrays.asList(b));
    ArrayList<String> ele3 = new ArrayList<>(Arrays.asList(c));
    ArrayList<String> ele4 = new ArrayList<>(Arrays.asList(d));
    ArrayList<String> ele5 = new ArrayList<>(Arrays.asList(e));
    ArrayList<String> ele6 = new ArrayList<>(Arrays.asList(f));
    ArrayList<String> ele7 = new ArrayList<>(Arrays.asList(g));
    ArrayList<String> ele8 = new ArrayList<>(Arrays.asList(h));
    ArrayList<String> ele9 = new ArrayList<>(Arrays.asList(i));
    ArrayList<String> ele11 = new ArrayList<>(Arrays.asList(k));
    ArrayList<String> ele12 = new ArrayList<>(Arrays.asList(l));
    ArrayList<String> ele13 = new ArrayList<>(Arrays.asList(m));
    ArrayList<String> ele14 = new ArrayList<>(Arrays.asList(n));
    ArrayList<String> ele15 = new ArrayList<>(Arrays.asList(o));
    ArrayList<String> ele16 = new ArrayList<>(Arrays.asList(p));
    ArrayList<String> ele17 = new ArrayList<>(Arrays.asList(q));
    ArrayList<String> ele18 = new ArrayList<>(Arrays.asList(r));
    ArrayList<String> ele19 = new ArrayList<>(Arrays.asList(s));
    ArrayList<String> ele20 = new ArrayList<>(Arrays.asList(t));
    ArrayList<String> ele21 = new ArrayList<>(Arrays.asList(u));
    ArrayList<String> ele22 = new ArrayList<>(Arrays.asList(v));
    ArrayList<String> ele23 = new ArrayList<>(Arrays.asList(w));
    ArrayList<String> ele24 = new ArrayList<>(Arrays.asList(x));
    ArrayList<String> ele25 = new ArrayList<>(Arrays.asList(y));
    ArrayList<String> ele26 = new ArrayList<>(Arrays.asList(z));
    ListView optionList;
    TextView hint;
    Object[] keyArray;
    String key;
    int Score=0;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wordList.put("college",ele1);
        wordList.put("hospital",ele2);
        wordList.put("petrol",ele3);
        wordList.put("exam",ele4);
        wordList.put("cactus",ele5);
        wordList.put("snake",ele6);
        wordList.put("boat",ele7);
        wordList.put("bee",ele8);
        wordList.put("chicken",ele9);
        wordList.put("cow",ele11);
        wordList.put("grass",ele12);
        wordList.put("novel",ele13);
        wordList.put("wig",ele14);
        wordList.put("car",ele15);
        wordList.put("hungry",ele16);
        wordList.put("cheese",ele17);
        wordList.put("camera",ele18);
        wordList.put("penguin",ele19);
        wordList.put("iceCream",ele20);
        wordList.put("boots",ele21);
        wordList.put("leaf",ele22);
        wordList.put("taxi",ele23);
        wordList.put("pilot",ele24);
        wordList.put("bridge",ele25);
        wordList.put("camel",ele26);
        displayList();
    }

    public  void displayList(){
        if(wordList.size()>0) {
            count=3;
            optionList = (ListView) findViewById(R.id.optionList);
            keyArray = wordList.keySet().toArray();
            key = keyArray[new Random().nextInt(wordList.size())].toString();
            int length = key.length();
            hint = (TextView) findViewById(R.id.hint_textView);
            hint.setText(String.format("HINT : number of character : %d", length));
            ArrayList<String> values = wordList.get(key);
            ArrayAdapter<String> optionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);
            optionList.setAdapter(optionAdapter);
            TextView scoreTextView = (TextView) findViewById(R.id.scoreTextView);
            scoreTextView.setText("Score:"+Score);
        }
        else{
            Intent intent = new Intent(this, endActivity.class);
            Bundle extras = new Bundle();
            String message = "THANK YOU!!";
            String scoreMessage = "Your final Score is : "+Score;
            extras.putString("Extra_message",message);
            extras.putString("Extra_Score",scoreMessage);
            intent.putExtras(extras);
            startActivity(intent);
        }
    }

    public void submitting (View v) {
        EditText userAnswer = (EditText) findViewById(R.id.answer_view);
        String answer = userAnswer.getText().toString();
            if (key.equalsIgnoreCase(answer.trim()) && wordList.size() > 0) {
                Score++;
                wordList.remove(key);
                Context context = getApplicationContext();
                CharSequence text = "your answer is correct!! Answer the next one";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                userAnswer.setText("");
                displayList();
            } else if(!key.equalsIgnoreCase(answer.trim()) && count > 0){
                Context context = getApplicationContext();
                CharSequence text = "Try Again! you have "+(count-1)+" chances left";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                count--;
            }
            else if(!key.equalsIgnoreCase(answer.trim()) && count == 0 ){
                Context context = getApplicationContext();
                CharSequence text = "the answer is "+key+" try next one.";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                if(Score==0){
                    Score=0;
                }
                else{
                    Score--;
                    TextView scoreTextView = (TextView) findViewById(R.id.scoreTextView);
                    scoreTextView.setText("Score:"+Score);
                }
                userAnswer.setText("");
                displayList();
            }
        }

    public void endgame(View v){
        Intent intent = new Intent(this, endActivity.class);
        Bundle extras = new Bundle();
        String message = "THANK YOU!!";
        String scoreMessage = "Your final Score is : "+Score;
        extras.putString("Extra_message",message);
        extras.putString("Extra_Score",scoreMessage);
        intent.putExtras(extras);
        startActivity(intent);
    }
}