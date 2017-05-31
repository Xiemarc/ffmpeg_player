package com.xie.ffmpeg_player;

/**
 * des:
 * author: marc
 * date:  2017/5/26 20:46
 * email：aliali_ha@yeah.net
 */

public class VideoUtils {
    //视频解码
    public native static void decode(String input, String output);

    static {
        System.loadLibrary("avutil-54");
        System.loadLibrary("swresample-1");
        System.loadLibrary("avcodec-56");
        System.loadLibrary("avformat-56");
        System.loadLibrary("swscale-3");
        System.loadLibrary("postproc-53");
        System.loadLibrary("avfilter-5");
        System.loadLibrary("avdevice-56");
        System.loadLibrary("ffmpeg-lib");
    }
}
