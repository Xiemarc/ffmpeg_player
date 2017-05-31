#include <jni.h>

#ifndef _Included_com_xie_ffmpeg_player_VideoUtils
#define _Included_com_xie_ffmpeg_player_VideoUtils
#ifdef __cplusplus
extern "C" {
#endif
JNIEXPORT void JNICALL Java_com_xie_ffmpeg_1player_VideoUtils_decode
  (JNIEnv *, jclass, jstring, jstring);

#ifdef __cplusplus
}
#endif
#endif
