export const myMixinA = {
    data() {
        return {
            dataA: 'aaa'
        }
    },
    methods: {
        say() {
            console.log('你好啊')
        }
    },
    mounted() {
        console.log('mounted')
    }
}
