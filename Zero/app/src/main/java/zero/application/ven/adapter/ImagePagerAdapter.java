package zero.application.ven.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

import zero.application.ven.fragment.ImageFragment;

/**
 * Created by anh on 01/03/2017.
 */

public class ImagePagerAdapter extends FragmentStatePagerAdapter {

    ArrayList<String> urls;
    public ImagePagerAdapter(FragmentManager manager){
        super(manager);
        urls = new ArrayList<>();
    }

    public void setImageUrls(ArrayList<String> urlsArr){
        this.urls = urlsArr;
    }

    @Override
    public Fragment getItem(int position) {
        return ImageFragment.newInstance(urls.get(position));
    }

    @Override
    public int getCount() {
        return urls.size();
    }
}
