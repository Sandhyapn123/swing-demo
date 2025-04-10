FROM gitpod/workspace-full

RUN sudo apt-get update && \
    sudo apt-get install -y openjdk-17-jdk xvfb x11vnc fluxbox xterm wget net-tools && \
    mkdir -p ~/.vnc && \
    x11vnc -storepasswd 1234 ~/.vnc/passwd
