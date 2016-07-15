package ly.generalassemb.drewmahrt.shoppinglistwithsearch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CursorAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by generalassembly on 7/14/16.
 */
public class RetrievalDepot extends AppCompatActivity {
    private CursorAdapter mCursorAdapter;
    private ListView mlistView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.retrieval_depot);


        mlistView = (ListView)findViewById(R.id.numbers_list_view);
        mlistView.setEmptyView(findViewById(R.id.no_results_text));
    }
}
