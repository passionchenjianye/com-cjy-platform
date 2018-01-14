#!/usr/bin/env bash

set -eo pipefail

modules=( service-eureka service-ribbon service-system service-producer service-feign )

for module in "${modules[@]}"; do
    docker build -t "cjy/${module}:latest" ${module}
done