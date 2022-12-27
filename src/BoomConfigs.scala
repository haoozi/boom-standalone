package boom.system

import freechips.rocketchip.config.{Config}
import freechips.rocketchip.system.BaseConfig
import freechips.rocketchip.subsystem.WithCoherentBusTopology

// ---------------------
// BOOM Configs
// ---------------------

class SmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(1) ++                          // small boom config
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class MediumBoomConfig extends Config(
  new boom.common.WithNMediumBooms(1) ++                         // medium boom config
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class LargeBoomConfig extends Config(
  new boom.common.WithNLargeBooms(1) ++                          // large boom config
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class MegaBoomConfig extends Config(
  new boom.common.WithNMegaBooms(1) ++                           // mega boom config
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class GigaBoomConfig extends Config(
  new boom.common.WithNGigaBooms(1) ++                           // giga boom config
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class DualSmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(2) ++                          // 2 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class QuadSmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(4) ++                          // 4 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class HexaSmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(6) ++                          // 6 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class OctaSmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(8) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)


class DualLargeBoomConfig extends Config(
   new boom.common.WithNLargeBooms(2) ++                          // 2 large boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)

class QuadLargeBoomConfig extends Config(
   new boom.common.WithNLargeBooms(4) ++                          // 4 large boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)

class HexaLargeBoomConfig extends Config(
   new boom.common.WithNLargeBooms(6) ++                          // 6 large boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)

class OctaLargeBoomConfig extends Config(
   new boom.common.WithNLargeBooms(8) ++                          // 8 large boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)


class DualMegaBoomConfig extends Config(
   new boom.common.WithNMegaBooms(2) ++                          // 2 mega boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)

class QuadMegaBoomConfig extends Config(
   new boom.common.WithNMegaBooms(4) ++                          // 4 mega boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)

class HexaMegaBoomConfig extends Config(
   new boom.common.WithNMegaBooms(6) ++                          // 6 mega boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)


class OctaMegaBoomConfig extends Config(
   new boom.common.WithNMegaBooms(8) ++                          // 8 mega boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)



class DualGigaBoomConfig extends Config(
  new boom.common.WithNGigaBooms(2) ++                           // 2 giga boom
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class QuadGigaBoomConfig extends Config(
  new boom.common.WithNGigaBooms(4) ++                           // 4 giga boom
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class HexaGigaBoomConfig extends Config(
  new boom.common.WithNGigaBooms(6) ++                           // 6 giga boom
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)
