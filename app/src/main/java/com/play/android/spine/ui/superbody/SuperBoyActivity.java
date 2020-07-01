package com.play.android.spine.ui.superbody;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.esotericsoftware.spine.superspineboy.SuperSpineboy;

public class SuperBoyActivity extends AndroidApplication {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        initialize(new SuperSpineboy(), config);
    }
}
