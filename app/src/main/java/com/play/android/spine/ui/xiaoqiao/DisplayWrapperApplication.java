package com.play.android.spine.ui.xiaoqiao;


import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.esotericsoftware.spine.Animation;
import com.esotericsoftware.spine.view.core.DisplayRenderParam;
import com.esotericsoftware.spine.view.core.SkeletonDisplayer;
import com.esotericsoftware.spine.view.core.SkeletonDisplayerBuilder;

public class DisplayWrapperApplication extends ApplicationAdapter {
    DisplayRenderParam renderParam;
    SkeletonDisplayer skeletonDisplayer;

    public void setRenderParam(DisplayRenderParam renderParam) {
        this.renderParam = renderParam;
    }

    @Override
    public void create() {
        super.create();
        skeletonDisplayer = new SkeletonDisplayerBuilder()
//                .setAtlasGdxFilePath("xiaoqiao/xiaoqiao.atlas")
//                .setSkeletonGdxFilePath("xiaoqiao/xiaoqiao.json")
                .setAtlasGdxFilePath("bianfujing/bianfujing.atlas")
                .setSkeletonGdxFilePath("bianfujing/bianfujing.json")
                .build();
        skeletonDisplayer.create();
        // index:0, loop:true, mixDuration:0.37, mixBlend:replace, alpha:1.0
        skeletonDisplayer.setAnimationByIndex(0,true,
                0.37f,
                Animation.MixBlend.replace,
                1.0f);
    }

    @Override
    public void render() {
        super.render();
        renderParam.setDelta(Gdx.graphics.getDeltaTime());
        skeletonDisplayer.setRenderParam(renderParam);
        skeletonDisplayer.render();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        skeletonDisplayer.resize(width,height);
    }
}
