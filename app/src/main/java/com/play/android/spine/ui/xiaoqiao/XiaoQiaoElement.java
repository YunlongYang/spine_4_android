package com.play.android.spine.ui.xiaoqiao;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.esotericsoftware.spine.Skeleton;
import com.esotericsoftware.spine.SkeletonData;
import com.esotericsoftware.spine.SkeletonJson;
import com.esotericsoftware.spine.SkeletonRendererDebug;

public class XiaoQiaoElement extends ApplicationAdapter {

    TextureAtlas atlas;
    SkeletonJson json;
    SkeletonData skeletonData;
    Skeleton skeleton;
    ShapeRenderer shapes;
    SkeletonRendererDebug skeletonRendererDebug;// = new SkeletonRendererDebug(shapes);
    @Override
    public void create() {
        super.create();
        atlas = new TextureAtlas(Gdx.files.internal("xiaoqiao/xiaoqiao.atlas"));
        json = new SkeletonJson(atlas);
        skeletonData = json.readSkeletonData(Gdx.files.internal("xiaoqiao/xiaoqiao.json"));
        skeleton = new Skeleton(skeletonData);
        shapes = new ShapeRenderer();
        skeletonRendererDebug = new SkeletonRendererDebug(shapes);
    }

    @Override
    public void render() {
        super.render();
        skeletonRendererDebug.draw(skeleton);
    }
}
