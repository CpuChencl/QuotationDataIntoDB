#!/bin/bash
echo "start !"

LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/usr/local/lib
export LD_LIBRARY_PATH


java -Djava.ext.dirs=./lib -jar  QuotationDataIntoDB.jar com.lion.main.MainApp ./config/ &