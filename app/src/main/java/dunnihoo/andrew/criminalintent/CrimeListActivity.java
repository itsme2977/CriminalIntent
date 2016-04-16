package dunnihoo.andrew.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by andrew on 4/16/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
