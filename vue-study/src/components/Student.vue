<template>
  <div>
    <h1>{{ msg }}</h1>
    <h1>学生姓名: {{ name }}</h1>
    <h1>学生年龄: {{ age }}</h1>
    <h1>学生性别: {{ sex }}</h1>
    <hr/>
  </div>
</template>

<script>
import {myMixinA} from "@/mixins/myMixin";

export default {
  name: "Student",
  // 写法一: 简单接收
  // props: ['name', 'age', 'sex'],

  // 写法二:  接收时对类型进行限制
  // props: {
  //   name: String,
  //   age: Number,
  //   sex: String
  // },
  mixins: [myMixinA],
  props: {
    name: {
      type: String,
      required: true
    },
    age: {
      type: Number,
      default: 33
    },
    sex: {
      type: String
    }
  },
  data() {
    return {
      msg: '一个学生组件1'
    }
  }
}
</script>

<style scoped>

</style>
