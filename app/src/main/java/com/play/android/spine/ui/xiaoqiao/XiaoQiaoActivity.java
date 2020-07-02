package com.play.android.spine.ui.xiaoqiao;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.esotericsoftware.spine.view.core.DisplayRenderParam;

public class XiaoQiaoActivity extends AndroidApplication {
    DisplayWrapperApplication displayWrapperApplication;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        config.numSamples = 20;

        displayWrapperApplication = new DisplayWrapperApplication();

        DisplayRenderParam displayRenderParam = new DisplayRenderParam();
        displayRenderParam.setShowBones(true);
        displayRenderParam.setShowRegions(false);
        displayRenderParam.setShowBoundingBoxes(false);
        displayRenderParam.setShowPaths(false);
        displayRenderParam.setShowPoints(false);
        displayRenderParam.setShowClipping(false);
        displayRenderParam.setShowPremultipliedAlpha(false);
        displayRenderParam.setSpeed(0.3f);
        displayRenderParam.setScaleX(1.0f);
        displayRenderParam.setScaleY(1.0f);
        displayRenderParam.setDefaultMix(0.37f);
        displayWrapperApplication.setRenderParam(displayRenderParam);
        initialize(displayWrapperApplication, config);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
