package com.google.android.libraries.mediaframework.layeredvideo;

import android.util.Log;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.google.android.libraries.mediaframework.R;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import io.ingrain.sdk.IngrainAdView;

/**
 * Created by wingoku on 4/3/15.
 */
public class IngrainViewLayer implements Layer{

    private IngrainAdView ingrainView;


    @Override
    public IngrainAdView createView(LayerManager layerManager) {
        LayoutInflater inflater = layerManager.getActivity().getLayoutInflater();
        ingrainView =  (IngrainAdView) inflater.inflate(R.layout.ingrain_ad_view, null, true);
        return ingrainView;
    }

    @Override
    public void onLayerDisplayed(LayerManager layerManager) {

    }

    public IngrainAdView getIngrainAdView()
    {
        return ingrainView;
    }
}
