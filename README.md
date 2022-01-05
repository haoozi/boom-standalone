# boom-standalone
Running Boom with Rocket Chip's IO and debug port. 

# How to use
Initialize repo by

```
git submodule update --init --recursive
```

To get FIRRTL code using LargeBoomConfig, run

```
cd ./verisim; make firrtl CONFIG=LargeBoomConfig
```

To run boom using verilator, use

```
cd ./verisim; make
```

# Boom config
Configuration for Boom core can be found under

```
./src/BoomConfig.scala
```