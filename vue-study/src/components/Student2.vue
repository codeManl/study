<template>
  <div>
    <h1>{{ msg }}</h1>
    <h1>学生姓名: {{ name }}</h1>
    <button @click="say">点击按钮</button>
    <hr/>
  </div>
</template>

<script>
import {myMixinA} from "@/mixins/myMixin";

export default {
  name: "Student2",
  mixins: [myMixinA],
  props: {
    name: {
      type: String,
      required: true
    }
  },
  data() {
    return {
      msg: '一个学生组件2'
    }
  },
  mounted() {
    console.log('mounted2在mixin之后')
  }
}
</script>

<style scoped>

</style>
