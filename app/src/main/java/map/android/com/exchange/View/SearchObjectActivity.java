package map.android.com.exchange.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import map.android.com.exchange.R;

/**
 * Created by apprenti on 19/01/18.
 */

public class SearchObjectActivity extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootview = inflater.inflate(R.layout.tab_search, container, false);
		return rootview;
	}
}
