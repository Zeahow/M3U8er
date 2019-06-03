package com.zeahow.m3u8er.download;

public enum TaskStatus {
    DOWNLOADING,    // 下载中
    TRANSCODING,    // 转码中
    SUCCESS,        // 成功
    FAILED,         // 失败
    PAUSED,         // 暂停
    CANCELED        // 取消
}
