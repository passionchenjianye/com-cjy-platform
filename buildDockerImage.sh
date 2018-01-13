#!/usr/bin/env bash

set -eo pipefail

modules=( service-eureka config-server service-ribbon service-system service-producer service-consumer )

for module in "${modules[@]}"; do
    docker build -t "cjy/${module}:latest" ${module}
done