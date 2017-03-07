package zero.application.ven.zero;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;

import zero.application.ven.fragment.ReadingFragment;

public class MainActivity extends AppCompatActivity {
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ArrayList<String> urls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        urls = new ArrayList<>();
        urls.add("http://2.bp.blogspot.com/-TezKSU1ASSc/TjryOQlLwZI/AAAAAAAAA2s/_lkNaO9aoRM/001.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-QFCH4qJR_pk/TjryO8zNYXI/AAAAAAAAA2w/UKHT63OdyCY/002.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-V04_oaHGNt4/TjryPt1xiVI/AAAAAAAAA24/b8kg5GsITjo/003.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-cdupwaF5ees/TjryQD21kRI/AAAAAAAAA28/hgthOPB_ckw/004.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-ePAxm6Y8bDQ/TjryQ7DHpfI/AAAAAAAAA3A/7M7yj990K9k/005.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-1u1q39g06Pw/TjryRanQ3rI/AAAAAAAAA3E/g9dA815ZCwc/006.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-NnY9VLat1X8/TjrySPbQOdI/AAAAAAAAA3I/tmF3d3BtU2c/007.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-O1zcZb8JWKk/TjryS_Gg8eI/AAAAAAAAA3M/K4Xa6FGnJwE/008.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-SDPaxTpuVB4/TjryT8Z86XI/AAAAAAAAA3U/b9n00wD2xac/009.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-Q-WAHxFvFmc/TjryUe2ifoI/AAAAAAAAA3Y/PNCB7dA3Wr0/010.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-M7nUHOioT3I/TjryVFP-laI/AAAAAAAAA3c/vtlyj40VRuc/011.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-sAUoc4vUI5U/TjryVjToXUI/AAAAAAAAA3g/Lk4D7_g3QN0/012.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-2ZNn2aAyGDQ/TjryWVTJ5yI/AAAAAAAAA3k/WbQc1RfbBvI/013.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-Kr-IvDZ1myY/TjryWysIibI/AAAAAAAAA3o/ojrnMpkfjG8/014.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-R3mkG_LraFk/TjryXxzjpvI/AAAAAAAAA3s/oFBdSeC29x8/015.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-0uZi2l_GROo/TjryYls6YhI/AAAAAAAAA3w/ZptWaznUlcg/016.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-Fp9gnUuzlMc/TjryZenH9PI/AAAAAAAAA30/HlIvPW10MNc/017.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-vY6Yn6ckhB0/TjryZ9WwW-I/AAAAAAAAA34/Mf3iqBhVG7U/018.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-PznPhMxcrDU/TjryaUKW7oI/AAAAAAAAA38/1fzmwUMrTdE/019.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-3tMIXPyy-XE/TjrybQsmmdI/AAAAAAAAA4A/Zx2_BGbNpsQ/020.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-czfoywORNpA/TjrycCJFvUI/AAAAAAAAA4I/YDhujxyz9O4/021.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-VoVfcD_V224/Tjryci06KAI/AAAAAAAAA4M/_IRiVWfgGiY/022.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-S1tmtbTLtK4/TjrydmKWV2I/AAAAAAAAA4Q/ai1VFmxNnaA/023.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-4G5nhrWU2Qk/TjryeRBcKXI/AAAAAAAAA4U/EUEg09o0K9s/024.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-zlOj8AkfpEg/TjryfCGBdgI/AAAAAAAAA4Y/9Mc8gJ-COlQ/025.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-azwALSGWstc/Tjryf_K9-EI/AAAAAAAAA4g/hX-dKqwFJHc/026.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-_8uO_Opylcw/TjrygVH4OiI/AAAAAAAAA4k/bPrASRssfog/027.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-GTdvOLYdQSA/TjryhDpmReI/AAAAAAAAA4o/HwbJvh3gPhU/028.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-q89AZ_i2jwc/Tjryh28MO9I/AAAAAAAAA4s/nMkPwbse4Xw/029.jpg?imgmax=3000");
        urls.add("http://2.bp.blogspot.com/-3AbTYGD4L3I/TjryisrDiXI/AAAAAAAAA4w/yHCP9bR-3u0/030.jpg?imgmax=3000");

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content_frame, ReadingFragment.newInstance(urls));
        ft.commit();

        mPlanetTitles = getResources().getStringArray(R.array.planets_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        mDrawerList.setAdapter(new ArrayAdapter<>(this,
                R.layout.drawer_list_item, mPlanetTitles));
        // Set the list's click listener
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }

    /** Swaps fragments in the main content view */
    private void selectItem(int position) {
        // Create a new fragment and specify the planet to show based on position
        Fragment fragment = new PlanetFragment();
        Bundle args = new Bundle();
        args.putInt(PlanetFragment.ARG_PLANET_NUMBER, position);
        fragment.setArguments(args);

        if(position == 0) {
            fragment = ReadingFragment.newInstance(urls);
        }

        // Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame, fragment)
                .commit();

        // Highlight the selected item, update the title, and close the drawer
        mDrawerList.setItemChecked(position, true);
        setTitle(mPlanetTitles[position]);
        mDrawerLayout.closeDrawer(mDrawerList);
    }

    public static class PlanetFragment extends Fragment {
        public static final String ARG_PLANET_NUMBER = "planet_number";

        public PlanetFragment() {
            // Empty constructor required for fragment subclasses
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_planet, container, false);
            int i = getArguments().getInt(ARG_PLANET_NUMBER);
            String planet = getResources().getStringArray(R.array.planets_array)[i];

            int imageId = getResources().getIdentifier(planet.toLowerCase(Locale.getDefault()),
                    "drawable", getActivity().getPackageName());
            ((ImageView) rootView.findViewById(R.id.image)).setImageResource(imageId);
            getActivity().setTitle(planet);
            return rootView;
        }
    }
}
