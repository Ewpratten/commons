#! /bin/bash

# # Build version info
# rm python/version.bzl
# echo "version = \"$(cat python/VERSION)-$(git rev-parse HEAD | head -c7)\""

# Run publish
# bazel run //python:pycommons_upload -- --pypi_user=__token__ --pypi_pass=$1
set -e
bazel build //python:pycommons
python3 python/setup.py 