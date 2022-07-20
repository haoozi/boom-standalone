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

class DualSmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(2) ++                          // 2 boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class QuadMegaBoomConfig extends Config(
  new boom.common.WithNMegaBooms(4) ++                          // 4 mega boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)