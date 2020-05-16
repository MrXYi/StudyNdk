//
// Created by Zac on 2019/3/4.
//

#include "NativeLearn.h"
#include "LogUtils.h"


void NativeInit(std::string config) {
    int str_long = sizeof(config);
    char *setKx = new char[str_long];
    strcpy(setKx, config.c_str());
    showLog(setKx);
}