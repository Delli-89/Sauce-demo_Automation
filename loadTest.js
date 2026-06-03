import http from 'k6/http';
import { check } from 'k6';

export const options = {
    vus: 50,          // Concurrent Users
    duration: '2m',   // Test Duration
};

export default function () {
    const response = http.get('https://reqres.in/api/users?page=1');

    check(response, {
        'status is 200': (r) => r.status === 200,
    });
}