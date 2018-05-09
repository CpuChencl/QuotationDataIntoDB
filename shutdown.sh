#!/bin/bash
echo "shutdown..."

ps -ef | grep QuotationDataIntoDB | awk '{print $2}' | xargs kill -9
