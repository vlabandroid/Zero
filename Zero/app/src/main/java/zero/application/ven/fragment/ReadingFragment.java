package zero.application.ven.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import zero.application.ven.adapter.ImagePagerAdapter;
import zero.application.ven.zero.R;

/**
 * Created by anh on 03/03/2017.
 */

public class ReadingFragment extends Fragment {

    private static String URLS_ARRAY_KEY = "url_arr";
    ArrayList<String> urls;

    public static ReadingFragment newInstance(ArrayList<String> urlsArr){
        ReadingFragment fragment = new ReadingFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(URLS_ARRAY_KEY, urlsArr);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        urls = getArguments().getStringArrayList(URLS_ARRAY_KEY);
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reading, container, false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.vpPager);
        ImagePagerAdapter adapter = new ImagePagerAdapter(getChildFragmentManager());
        adapter.setImageUrls(urls);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(10);
        return view;
    }
}
