package zero.application.ven.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import zero.application.ven.zero.R;

/**
 * Created by anh on 01/03/2017.
 */

public class ImageFragment extends Fragment {
    private static final String IMAGE_URL = "image_url";
    private String imageUrl;

    public static ImageFragment newInstance(String url){
        ImageFragment fragment = new ImageFragment();
        Bundle args = new Bundle();
        args.putString(IMAGE_URL, url);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        imageUrl = getArguments().getString(IMAGE_URL);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image, container,false);
        ImageView image = (ImageView) view.findViewById(R.id.img);
        Picasso.with(getContext())
                .load(imageUrl)
                .into(image);
        return view;
    }
}
