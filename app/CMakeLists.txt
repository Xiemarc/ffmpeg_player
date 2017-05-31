#配置CMake的最低版本
cmake_minimum_required(VERSION 3.4.1)
#配置工程路径
set(path_project J:/GitHub/ffmpeg_player)

#配置头文件的包含路径
include_directories(${path_project}/app/src/main/cpp/include)
#添加自己写的库
add_library(
             ffmpeg-lib
             SHARED
             src/main/cpp/ffmpeg_player.c )

#添加FFmpeg预编译的so库
add_library( avutil
             SHARED
             IMPORTED
            )
#设置两个预编译的库的路径
set_target_properties(
                       avutil
                       PROPERTIES IMPORTED_LOCATION
                       ${path_project}/app/libs/${ANDROID_ABI}/libavutil-54.so
                    )

add_library( swresample
             SHARED
             IMPORTED
            )

set_target_properties(
                       swresample
                       PROPERTIES IMPORTED_LOCATION
                       ${path_project}/app/libs/${ANDROID_ABI}/libswresample-1.so
                    )

add_library( avcodec
             SHARED
             IMPORTED
            )

set_target_properties(
                       avcodec
                       PROPERTIES IMPORTED_LOCATION
                       ${path_project}/app/libs/${ANDROID_ABI}/libavcodec-56.so
                    )

add_library( avformat
             SHARED
             IMPORTED
            )

set_target_properties(
                       avformat
                       PROPERTIES IMPORTED_LOCATION
                       ${path_project}/app/libs/${ANDROID_ABI}/libavformat-56.so
                    )

add_library( swscale
             SHARED
             IMPORTED
            )

set_target_properties(
                       swscale
                       PROPERTIES IMPORTED_LOCATION
                       ${path_project}/app/libs/${ANDROID_ABI}/libswscale-3.so
                    )

add_library( postproc
             SHARED
             IMPORTED
            )

set_target_properties(
                       postproc
                       PROPERTIES IMPORTED_LOCATION
                       ${path_project}/app/libs/${ANDROID_ABI}/libpostproc-53.so
                    )

add_library( avfilter
             SHARED
             IMPORTED
            )

set_target_properties(
                       avfilter
                       PROPERTIES IMPORTED_LOCATION
                       ${path_project}/app/libs/${ANDROID_ABI}/libavfilter-5.so
                    )

add_library( avdevice
             SHARED
             IMPORTED
            )

set_target_properties(
                       avdevice
                       PROPERTIES IMPORTED_LOCATION
                       ${path_project}/app/libs/${ANDROID_ABI}/libavdevice-56.so
                    )


find_library(
              log-lib

              log )

#把需要的库链接到自己的库中
target_link_libraries(
                      ffmpeg-lib
                      ${log-lib}
                      avutil
                      swresample
                      avcodec
                      avformat
                      swscale
                      postproc
                      avfilter
                      avdevice )